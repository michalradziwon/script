
  package gen;
  public class H_Gen79 {
  		@com.google.inject.Inject
  		public H_Gen79(H_Gen80 h_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  