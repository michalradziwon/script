
  package gen;
  public class T_Gen66 {
  		@com.google.inject.Inject
  		public T_Gen66(T_Gen67 t_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  