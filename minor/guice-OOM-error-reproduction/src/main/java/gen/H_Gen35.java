
  package gen;
  public class H_Gen35 {
  		@com.google.inject.Inject
  		public H_Gen35(H_Gen36 h_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  