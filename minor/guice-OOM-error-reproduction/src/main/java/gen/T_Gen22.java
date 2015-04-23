
  package gen;
  public class T_Gen22 {
  		@com.google.inject.Inject
  		public T_Gen22(T_Gen23 t_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  