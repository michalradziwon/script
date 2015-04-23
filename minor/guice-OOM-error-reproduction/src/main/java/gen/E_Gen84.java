
  package gen;
  public class E_Gen84 {
  		@com.google.inject.Inject
  		public E_Gen84(E_Gen85 e_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  