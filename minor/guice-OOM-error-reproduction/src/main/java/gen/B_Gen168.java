
  package gen;
  public class B_Gen168 {
  		@com.google.inject.Inject
  		public B_Gen168(B_Gen169 b_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  