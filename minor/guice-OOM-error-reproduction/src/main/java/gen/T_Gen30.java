
  package gen;
  public class T_Gen30 {
  		@com.google.inject.Inject
  		public T_Gen30(T_Gen31 t_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  