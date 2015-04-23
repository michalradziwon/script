
  package gen;
  public class H_Gen80 {
  		@com.google.inject.Inject
  		public H_Gen80(H_Gen81 h_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  