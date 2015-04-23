
  package gen;
  public class M_Gen44 {
  		@com.google.inject.Inject
  		public M_Gen44(M_Gen45 m_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  