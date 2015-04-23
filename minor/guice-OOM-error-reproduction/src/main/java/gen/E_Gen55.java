
  package gen;
  public class E_Gen55 {
  		@com.google.inject.Inject
  		public E_Gen55(E_Gen56 e_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  