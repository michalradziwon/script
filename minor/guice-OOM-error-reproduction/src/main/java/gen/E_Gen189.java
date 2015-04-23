
  package gen;
  public class E_Gen189 {
  		@com.google.inject.Inject
  		public E_Gen189(E_Gen190 e_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  