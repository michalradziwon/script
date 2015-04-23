
  package gen;
  public class T_Gen112 {
  		@com.google.inject.Inject
  		public T_Gen112(T_Gen113 t_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  