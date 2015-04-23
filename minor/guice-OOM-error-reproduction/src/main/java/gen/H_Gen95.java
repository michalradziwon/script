
  package gen;
  public class H_Gen95 {
  		@com.google.inject.Inject
  		public H_Gen95(H_Gen96 h_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  