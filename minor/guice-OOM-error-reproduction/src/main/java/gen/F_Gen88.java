
  package gen;
  public class F_Gen88 {
  		@com.google.inject.Inject
  		public F_Gen88(F_Gen89 f_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  