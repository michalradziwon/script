
  package gen;
  public class T_Gen79 {
  		@com.google.inject.Inject
  		public T_Gen79(T_Gen80 t_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  