
  package gen;
  public class Q_Gen7 {
  		@com.google.inject.Inject
  		public Q_Gen7(Q_Gen8 q_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  