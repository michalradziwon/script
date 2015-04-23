
  package gen;
  public class H_Gen86 {
  		@com.google.inject.Inject
  		public H_Gen86(H_Gen87 h_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  