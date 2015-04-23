
  package gen;
  public class B_Gen119 {
  		@com.google.inject.Inject
  		public B_Gen119(B_Gen120 b_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  