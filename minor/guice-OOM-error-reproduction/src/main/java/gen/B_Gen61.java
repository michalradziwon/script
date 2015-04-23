
  package gen;
  public class B_Gen61 {
  		@com.google.inject.Inject
  		public B_Gen61(B_Gen62 b_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  