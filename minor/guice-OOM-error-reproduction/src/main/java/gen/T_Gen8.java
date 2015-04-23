
  package gen;
  public class T_Gen8 {
  		@com.google.inject.Inject
  		public T_Gen8(T_Gen9 t_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  