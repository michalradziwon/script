
  package gen;
  public class E_Gen181 {
  		@com.google.inject.Inject
  		public E_Gen181(E_Gen182 e_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  