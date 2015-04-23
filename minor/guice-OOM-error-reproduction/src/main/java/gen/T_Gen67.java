
  package gen;
  public class T_Gen67 {
  		@com.google.inject.Inject
  		public T_Gen67(T_Gen68 t_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  