
  package gen;
  public class E_Gen184 {
  		@com.google.inject.Inject
  		public E_Gen184(E_Gen185 e_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  