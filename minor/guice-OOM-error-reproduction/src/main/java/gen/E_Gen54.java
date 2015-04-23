
  package gen;
  public class E_Gen54 {
  		@com.google.inject.Inject
  		public E_Gen54(E_Gen55 e_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  