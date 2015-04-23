
  package gen;
  public class Q_Gen186 {
  		@com.google.inject.Inject
  		public Q_Gen186(Q_Gen187 q_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  