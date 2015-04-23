
  package gen;
  public class Q_Gen8 {
  		@com.google.inject.Inject
  		public Q_Gen8(Q_Gen9 q_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  