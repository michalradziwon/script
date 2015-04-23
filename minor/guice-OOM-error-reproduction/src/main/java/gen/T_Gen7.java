
  package gen;
  public class T_Gen7 {
  		@com.google.inject.Inject
  		public T_Gen7(T_Gen8 t_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  