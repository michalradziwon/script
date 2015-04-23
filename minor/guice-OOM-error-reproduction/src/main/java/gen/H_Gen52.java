
  package gen;
  public class H_Gen52 {
  		@com.google.inject.Inject
  		public H_Gen52(H_Gen53 h_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  