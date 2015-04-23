
  package gen;
  public class E_Gen178 {
  		@com.google.inject.Inject
  		public E_Gen178(E_Gen179 e_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  