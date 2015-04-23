
  package gen;
  public class O_Gen88 {
  		@com.google.inject.Inject
  		public O_Gen88(O_Gen89 o_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  