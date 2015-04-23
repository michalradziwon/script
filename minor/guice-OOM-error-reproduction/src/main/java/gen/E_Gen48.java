
  package gen;
  public class E_Gen48 {
  		@com.google.inject.Inject
  		public E_Gen48(E_Gen49 e_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  