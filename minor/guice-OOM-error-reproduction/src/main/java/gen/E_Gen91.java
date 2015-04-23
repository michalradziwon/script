
  package gen;
  public class E_Gen91 {
  		@com.google.inject.Inject
  		public E_Gen91(E_Gen92 e_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  