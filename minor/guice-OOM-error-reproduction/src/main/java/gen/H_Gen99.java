
  package gen;
  public class H_Gen99 {
  		@com.google.inject.Inject
  		public H_Gen99(H_Gen100 h_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  