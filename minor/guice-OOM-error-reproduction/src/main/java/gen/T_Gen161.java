
  package gen;
  public class T_Gen161 {
  		@com.google.inject.Inject
  		public T_Gen161(T_Gen162 t_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  