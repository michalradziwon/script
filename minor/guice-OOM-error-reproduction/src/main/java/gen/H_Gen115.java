
  package gen;
  public class H_Gen115 {
  		@com.google.inject.Inject
  		public H_Gen115(H_Gen116 h_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  