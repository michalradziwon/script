
  package gen;
  public class H_Gen17 {
  		@com.google.inject.Inject
  		public H_Gen17(H_Gen18 h_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  