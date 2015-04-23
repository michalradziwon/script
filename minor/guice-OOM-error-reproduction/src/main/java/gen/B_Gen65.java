
  package gen;
  public class B_Gen65 {
  		@com.google.inject.Inject
  		public B_Gen65(B_Gen66 b_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  