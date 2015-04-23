
  package gen;
  public class B_Gen84 {
  		@com.google.inject.Inject
  		public B_Gen84(B_Gen85 b_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  