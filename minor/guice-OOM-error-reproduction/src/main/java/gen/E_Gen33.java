
  package gen;
  public class E_Gen33 {
  		@com.google.inject.Inject
  		public E_Gen33(E_Gen34 e_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  