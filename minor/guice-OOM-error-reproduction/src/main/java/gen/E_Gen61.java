
  package gen;
  public class E_Gen61 {
  		@com.google.inject.Inject
  		public E_Gen61(E_Gen62 e_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  