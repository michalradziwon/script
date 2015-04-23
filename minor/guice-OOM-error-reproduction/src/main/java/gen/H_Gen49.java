
  package gen;
  public class H_Gen49 {
  		@com.google.inject.Inject
  		public H_Gen49(H_Gen50 h_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  