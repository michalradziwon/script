
  package gen;
  public class H_Gen26 {
  		@com.google.inject.Inject
  		public H_Gen26(H_Gen27 h_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  