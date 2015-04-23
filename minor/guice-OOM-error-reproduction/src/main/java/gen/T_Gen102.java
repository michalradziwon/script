
  package gen;
  public class T_Gen102 {
  		@com.google.inject.Inject
  		public T_Gen102(T_Gen103 t_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  