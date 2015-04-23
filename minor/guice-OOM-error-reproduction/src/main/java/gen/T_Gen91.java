
  package gen;
  public class T_Gen91 {
  		@com.google.inject.Inject
  		public T_Gen91(T_Gen92 t_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  