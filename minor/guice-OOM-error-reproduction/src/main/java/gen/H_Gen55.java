
  package gen;
  public class H_Gen55 {
  		@com.google.inject.Inject
  		public H_Gen55(H_Gen56 h_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  