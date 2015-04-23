
  package gen;
  public class E_Gen192 {
  		@com.google.inject.Inject
  		public E_Gen192(E_Gen193 e_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  