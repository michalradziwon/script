
  package gen;
  public class E_Gen194 {
  		@com.google.inject.Inject
  		public E_Gen194(E_Gen195 e_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  