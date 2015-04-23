
  package gen;
  public class E_Gen60 {
  		@com.google.inject.Inject
  		public E_Gen60(E_Gen61 e_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  