
  package gen;
  public class T_Gen96 {
  		@com.google.inject.Inject
  		public T_Gen96(T_Gen97 t_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  