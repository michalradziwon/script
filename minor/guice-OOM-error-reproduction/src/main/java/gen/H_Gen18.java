
  package gen;
  public class H_Gen18 {
  		@com.google.inject.Inject
  		public H_Gen18(H_Gen19 h_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  