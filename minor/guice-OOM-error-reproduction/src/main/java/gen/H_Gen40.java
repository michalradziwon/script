
  package gen;
  public class H_Gen40 {
  		@com.google.inject.Inject
  		public H_Gen40(H_Gen41 h_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  