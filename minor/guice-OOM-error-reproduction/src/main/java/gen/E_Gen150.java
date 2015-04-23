
  package gen;
  public class E_Gen150 {
  		@com.google.inject.Inject
  		public E_Gen150(E_Gen151 e_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  