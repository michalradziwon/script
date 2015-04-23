
  package gen;
  public class B_Gen88 {
  		@com.google.inject.Inject
  		public B_Gen88(B_Gen89 b_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  