
  package gen;
  public class H_Gen123 {
  		@com.google.inject.Inject
  		public H_Gen123(H_Gen124 h_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  