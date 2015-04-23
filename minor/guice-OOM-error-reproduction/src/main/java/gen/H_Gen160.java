
  package gen;
  public class H_Gen160 {
  		@com.google.inject.Inject
  		public H_Gen160(H_Gen161 h_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  